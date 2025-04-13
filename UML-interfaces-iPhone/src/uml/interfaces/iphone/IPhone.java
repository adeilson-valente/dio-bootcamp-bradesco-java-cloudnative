/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.interfaces.iphone;

import uml.interfaces.iphone.interfaces.AparelhoTelefonico;
import uml.interfaces.iphone.interfaces.NavegadorInternet;
import uml.interfaces.iphone.interfaces.ReprodutorMusical;

/**
 *
 * @author Adeilson Valente
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private double tamanhoTela;

    public void ligar() {
        System.out.println("iPhone ligando...");
    }

    public void desligar() {
        System.out.println("iPhone desligando...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.ligar();
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("A Benção");
        meuIPhone.pausar();

        meuIPhone.ligar("(62) 99999999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

        meuIPhone.desligar();
    }
}
