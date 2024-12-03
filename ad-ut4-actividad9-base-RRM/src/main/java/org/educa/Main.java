package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ClienteService clienteService = new ClienteService();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce el id del cliente a eliminar");
            Long id = sc.nextLong();
            sc.nextLine();
            ClienteEntity cliente = clienteService.findById(id);
            System.out.println("¿Estás seguro?(Pulse Y para eliminar, cualquier otra tecla para cancelar)");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                clienteService.remove(cliente);
            }
        }
    }
}