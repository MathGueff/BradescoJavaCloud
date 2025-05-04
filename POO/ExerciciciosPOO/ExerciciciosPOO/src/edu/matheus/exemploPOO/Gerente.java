package edu.matheus.exemploPOO;

public final class Gerente extends Funcionario{

    private String login;
    private String password;
    private double comissao;

    Gerente() {}

    @Override
    public double getFullSalary() {
        return this.getSalario() + comissao;
    }

    Gerente(String nome, int idade, String endereco, double salario, String login, String password,double comissao) {
        super(nome, idade, endereco, salario);
        this.login = login;
        this.password = password;
        this.comissao = comissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
