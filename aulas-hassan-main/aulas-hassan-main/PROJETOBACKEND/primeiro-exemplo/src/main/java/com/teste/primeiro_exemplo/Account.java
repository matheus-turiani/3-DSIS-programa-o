package com.teste.primeiro_exemplo;

public class Account {
    private String name; //variável de instância

    public Account(String name){
        this.name = name;
    }

    //método para definir o nome no objeto
    public void setName(String name)
    {
        this.name = name; //armazena o nome
    }
    
    //método para recuperar o nome do objeto
    public String getName()
    {
        return name; //retorna valor do nome para o chamador
    }
}
