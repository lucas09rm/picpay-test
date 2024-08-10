package com.example.picpay.controller.dto;

import com.example.picpay.entity.Wallet;
import com.example.picpay.entity.WalletType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWalletDto(@NotBlank String fullname,
                              @NotBlank String cpfCnpj,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull WalletType.Enum walletType) {

    public Wallet toWallet(){
        return new Wallet(
                fullname, cpfCnpj, email, password, walletType.get()
        );
    }
}