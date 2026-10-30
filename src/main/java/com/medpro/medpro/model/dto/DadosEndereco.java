package com.medpro.medpro.model.dto;

public record DadosEndereco(
    String logradouro,
    String bairro,
    String ce,
    String cidade,
    String uf,
    String numero,
    String complemento
) {
  
}
