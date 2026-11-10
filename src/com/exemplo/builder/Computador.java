package com.exemplo.builder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRam, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void exibirDados() {
        System.out.println("Processador: " + (processador != null ? processador : "N/A"));
        System.out.println("RAM: " + (memoriaRam != null ? memoriaRam : "N/A"));
        System.out.println("Armazenamento: " + (armazenamento != null ? armazenamento : "N/A"));
        System.out.println("Placa de vídeo: " + (placaDeVideo != null ? placaDeVideo : "N/A"));
        System.out.println("Sistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A"));
    }
}