package joas;
import javax.swing.*;
// Classes Abstratas e Interfaces

/*
 *  Não posso instanciar objetos de uma classe abstrada
 *  Pode ser um modelo pra criar subclasses
 *  Não podem existir construtores em classes abstratas
 *  
 *  Um método abstato não tem corpo, então ele deve ser sobrescrito nas subclasses
 *  
 *  Uma interface tem um conjunto de métodos, não podendo criar atributos
 */

public class Main {
	
	
	public static void main (String[]args) {
		
		Animal dog = new Cachorro("Veloz");
		
		dog.fazerSom();
		
	}
	
}

abstract class Animal {
	
	public Animal () {}
	public Animal (String nome) {
		this.nome = nome;
	}
	
	public String nome;
	
	public abstract void fazerSom ();
	
}

class Cachorro extends Animal {
	
	@Override
	public void fazerSom () {
		JOptionPane.showMessageDialog(null, this.nome + " - Auau");
	}
	
	public Cachorro() {}
	public Cachorro(String nome) {
		super(nome);
	}
	
}

class Gato extends Animal {
	
	@Override
	public void fazerSom () {
		JOptionPane.showMessageDialog(null, this.nome + " - Miau");
	}
	
}