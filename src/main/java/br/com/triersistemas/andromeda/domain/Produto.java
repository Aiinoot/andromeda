package br.com.triersistemas.andromeda.domain;

import br.com.triersistemas.andromeda.helper.StringUtils;

import java.time.LocalDate;

public class Cliente extends PessoaFisica{

    private String email;

    public Cliente() {
        this.email = StringUtils.geraNomeMedicamentoALeatorio();
    }
    public Cliente(final String nome, final LocalDate niver, final String cpf, final String email) {
        super(nome, niver, cpf);
        this.email = email;
    }
    public PessoaFisica editar(final String nome, final LocalDate niver, final String cpf, final String email) {
        super.editar(nome, niver, cpf);
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }
}
