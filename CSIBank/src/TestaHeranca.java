
public class TestaHeranca {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria");
		
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome(" Pedro");
		pf1.setCpf("122.112.111-56");
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("will");
		pj1.setCnpj("123.133./234");
	}

}
