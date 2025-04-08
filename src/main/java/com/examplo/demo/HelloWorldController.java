package com.examplo.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = {"/hellow", "/hi", "/ola", "/oi"})
public class HelloWorldController {
    
    
    @GetMapping
    public String olaMundo(HttpServletRequest request) {
        try { 
            String uri = request.getRequestURI().replace("/", "");
            return "%s Mundo!".formatted(uri);
        } catch (IndexOutOfBoundsException e) {
            return "Erro: Nome não fornecido.";
        } catch (Exception e) {
            return "Erro inesperado: " + e.getMessage();
        }
    }
    @GetMapping("/{nome}")
    public String olaNome(HttpServletRequest request) {
        // Separa os caminhos da URL pela /
        try {
            var params = Arrays.stream(request.getRequestURI().split("/")).toList();
            return "%s %s!".formatted(params.get(1), params.get(2));
        } catch (IndexOutOfBoundsException e) {
            return "Erro: Nome não fornecido.";
        } catch (Exception e) {
            return "Erro inesperado: " + e.getMessage();
        }
    }

    @GetMapping("/{nome}/{sobrenome}")
    public String olaSobrenome(HttpServletRequest request) {
        try {
        // Separa os caminhos da URL pela /
        var params = Arrays.stream(request.getRequestURI().split("/")).toList();
        return "%s %s %s!".formatted(params.get(1), params.get(2), params.get(3));
        } catch (IndexOutOfBoundsException e) {
            return "Erro: Nome não fornecido.";
        } catch (Exception e) {
            return "Erro inesperado: " + e.getMessage();
        }
    }
}
