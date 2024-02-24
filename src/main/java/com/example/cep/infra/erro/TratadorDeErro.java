package com.example.cep.infra.erro;

import com.example.cep.infra.exception.CepException;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

@RestControllerAdvice
public class TratadorDeErro {
    private final String projetoNome = "Api Funcionario";
    @Value("${spring.application.name}")
    private String projeto;
    @Autowired
    private HttpServletRequest request;

    @ExceptionHandler(CepException.class)
    public ResponseEntity<ErroResponse> erroOpenFaing(CepException ex){
        ErroResponse erroResponse = new ErroResponse();

        erroResponse.setStatus(HttpStatus.OK.value());
        erroResponse.setMensagem(Collections.singletonList(ex.getMessage()));
        erroResponse.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        erroResponse.setEndpoint(request.getRequestURI());
        erroResponse.setProjeto(projetoNome);

        return new ResponseEntity<>(erroResponse, HttpStatus.OK);
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<ErroResponse> erroSalvarBanco(SQLIntegrityConstraintViolationException ex){
        ErroResponse erroResponse = new ErroResponse();

        erroResponse.setStatus(HttpStatus.OK.value());
        erroResponse.setMensagem(Collections.singletonList(ex.getMessage()));
        erroResponse.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        erroResponse.setEndpoint(request.getRequestURI());
        erroResponse.setProjeto(projetoNome);

        return new ResponseEntity<>(erroResponse, HttpStatus.OK);
    }
}
