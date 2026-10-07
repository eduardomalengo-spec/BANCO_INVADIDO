import java.util.Scanner;

class BANCO_INVADIDO {
	private String nome = "KAUÃ";
    private int id = 1;
    private double saldo_atual = 2345.78;
    private int idade = 28;
    
    public BANCO_INVADIDO() {};
    
    public BANCO_INVADIDO(String nome, int id, double saldo_atual, int idade) {
    	this.nome = nome;
        this.id = id;
        this.saldo_atual = saldo_atual;
        this.idade = idade;
    }
    
    public String getNome() {
    	return nome;
    }
    public void setNome(String meuNome) {
    	this.nome = meuNome;
    }
    public int getId() {
    	return id;
    }
    public void setId(int meuId) {
    	this.id = meuId;
    }
    public double getSaldo_atual() {
    	return saldo_atual;
    }
    public void setSaldo_atual(double meuSaldo) {
    	this.saldo_atual = meuSaldo;
    }
    public int getIdade() {
    	return idade;
    }
    public void setIdade(int minhaIdade) {
    	this.idade = minhaIdade;
    }
    
    @Override
    public String toString() {
    	return "NOME: " + nome + " | ID: " + id + " | SALDO: " + saldo_atual + " | IDADE: " + idade + " | ";
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        BANCO_INVADIDO meu = new BANCO_INVADIDO();
        
        System.out.println("==========================================");
        System.out.println("|  RELATORIO DE SEGURANÇA INTERNACIONAL  |");
        System.out.println("==========================================");
        
        System.out.print("NOME?: ");
        String nome = sc.nextLine();
        sc.nextLine();
        
        System.out.println("ID?: ");
        int id = sc.nextInt();
        
        System.out.print("SALDO ATUAL?: ");
        double saldo_atual = sc.nextDouble();
        
        System.out.print("IDADE?: ");
        int idade = sc.nextInt();
        
        if(nome.equals("KAUÃ")) {
        	System.out.println(meu.getNome());
            meu.setNome("EDUARDO");
            System.out.println(meu.getNome());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        if(id == 1) {
        	System.out.println(meu.getId());
            meu.setId(2);
            System.out.println(meu.getId());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        if(saldo_atual == 2345.78) {
        	System.out.println(meu.getSaldo_atual());
            meu.setSaldo_atual(34560.98);
            System.out.println(meu.getSaldo_atual());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        if(idade == 28) {
        	System.out.println(meu.getIdade());
            meu.setIdade(23);
            System.out.println(meu.getIdade());
        }
        else {
        	System.out.println("[ ERROR ]");
        }
        
        System.out.println("=====================");
        System.out.println("|  RELATORIO FINAL  |");
        System.out.println("=====================");
        
        System.out.println("NOME: | " + meu.nome + " | ");
        System.out.println("ID: | " + meu.id + " | ");
        System.out.println("SALDO: | " + meu.saldo_atual + " | ");
        System.out.println("IDADE: | " + meu.idade + " | ");
        System.out.println(meu);
        
    }
}