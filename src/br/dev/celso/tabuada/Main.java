package br.dev.celso.tabuada;

import javax.swing.JFrame;

import br.dev.celso.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		tela.setTitle("DS1MA");
		tela.setSize(500, 600);
		tela.setVisible(true);
		
		System.out.println(tela.getSize().height);
		System.out.println(tela.getTitle());
		
	}

}
