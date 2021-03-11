
public class Caneta {

     String modelo;
     String cor;
	 float ponta;
	 int carga;
     boolean tampada;
	
	 void status (){
		System.out.println("modelo" + this.modelo);
		System.out.println(" uma caneta" + this.cor);
        System.out.println(" está tampada?" + this.tampada);
        System.out.println("ponta" + this.ponta);
        System.out.println("carga" + this.carga);
		
	}
	
	  void rabiscar () {
		if (this.tampada == true){
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
		
		
	}
	  void tampar (){
		this.tampada = true;
		
		
	}
	protected void destampar () {
		this.tampada = false;
		
	}
}
