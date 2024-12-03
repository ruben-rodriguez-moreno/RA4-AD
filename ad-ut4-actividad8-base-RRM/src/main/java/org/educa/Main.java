package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ClienteService clienteService = new ClienteService();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce el id del cliente");
            Long id = sc.nextLong();
            sc.nextLine();
            ClienteEntity cliente = clienteService.findById(id);
            System.out.println("Introduce el nuevo nombre del cliente:");
            cliente.setNombre(sc.nextLine());
            clienteService.update(cliente);
        }
    }
}