package model;

import java.util.Vector;

public class Departamento {
		private String sigla, nome;
		private Vector listaEmpregados;
		private Empregado gerente;
		
		public Departamento(String sigla, String nome, Vector listaEmpregados, Empregado gerente) {
			this.sigla = sigla;
			this.nome = nome;
			this.listaEmpregados = new Vector();
			this.gerente = gerente;
		}

		public String getSigla() {
			return sigla;
		}

		public void setSigla(String sigla) {
			this.sigla = sigla;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Vector getListaEmpregados() {
			return listaEmpregados;
		}

		public void setListaEmpregados(Vector listaEmpregados) {
			this.listaEmpregados = listaEmpregados;
		}

		public Empregado getGerente() {
			return gerente;
		}

		public void setGerente(Empregado gerente) {
			this.gerente = gerente;
		}
		
		public void addEmpregado(Empregado novoEmp) {
			listaEmpregados.add(novoEmp);
		}
		
		public void removeEmpregado(Empregado exEmp) {
			if(!listaEmpregados.contains(exEmp)) 
				return;
			else {
				listaEmpregados.remove(exEmp);
				exEmp.setDepto(null);
			}
			
		}
}
