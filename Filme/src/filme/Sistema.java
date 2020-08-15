package filme;

public class Sistema {

	public static void main(String[] args) {
	
		Filme Interstellar = new Filme("Interstellar");
		
		Filme AChegada = new Filme("A Chegada");
		
		Filme ClubeDaLuta = new Filme("Clube da Luta");
		
		Serie Supernatural = new Serie("Supernatural", ", temporada1", ", episodio1");
		
		Serie GreysAnatomy = new Serie("Greys Anatomy", "null", "null");
		
		Serie Friends = new Serie("Friends", "null", "null" );
		
		Pessoa Davy = new Pessoa("Davy");
		
		Pessoa Julia = new Pessoa("Julia");
		
		Pessoa Kaline = new Pessoa("Kaline");
		
		System.out.println(Interstellar.getNome());

		System.out.println(AChegada.getNome());
		
		System.out.println(ClubeDaLuta.getNome());
		
		System.out.println(Supernatural.getNome()+Supernatural.getTemp()+Supernatural.getEp());
		
		System.out.println(GreysAnatomy.getNome());
		
		System.out.println(Friends.getNome());
		
		System.out.println(Davy.getNome());
		
		System.out.println(Julia.getNome());
		
		System.out.println(Kaline.getNome());
	}
}



