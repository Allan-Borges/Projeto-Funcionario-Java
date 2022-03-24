package entities;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double taxa;
	
	public Funcionario() {		
	}
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto = (salarioBruto * porcentagem /100) + salarioLiquido() ;
	}
	public String toString() {
		return name
		+ " O valor do salário com reajuste é de R$"	
		+ salarioBruto;
	}
}
