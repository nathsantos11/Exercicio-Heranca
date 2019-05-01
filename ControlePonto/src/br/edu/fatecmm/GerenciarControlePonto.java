package br.edu.fatecmm;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Gerente g1 = new Gerente();
        g1.setIdFunc(001);
        g1.setNome("Nath");
        g1.setEmail("nath.adm@hotmail.com");
        g1.setDocumento("CPF 123.456.789-00");
        g1.setLogin("nath.adm");
        g1.setSenha("N@th");

        Secretaria s1 = new Secretaria();
        s1.setIdFunc(002);
        s1.setNome("Douglas");
        s1.setEmail("douglas@hotmail.com");
        s1.setDocumento("CPF 234.567.890-11");
        s1.setTelefone("19-3000-0001");
        s1.setRamal("3211");

        Operador o1 = new Operador();
        o1.setIdFunc(003);
        o1.setNome("Luciana");
        o1.setEmail("luciana@hotmail.com");
        o1.setDocumento("CPF 555.444.333-22");
        o1.setValorHora(7.50);

        RegistroPonto rp1 = new RegistroPonto();
        rp1.setFunc(g1);
        rp1.setDataRegistro(java.time.LocalDate.now());
        rp1.setHoraEntrada(java.time.LocalDateTime.now());
        Thread.sleep(10000);
        rp1.setHoraSaida(java.time.LocalDateTime.now());
        rp1.apresentarRegistroPonto();

        RegistroPonto rp2 = new RegistroPonto();
        rp2.setFunc(s1);
        rp2.setDataRegistro(java.time.LocalDate.now());
        rp2.setHoraEntrada(java.time.LocalDateTime.now());
        Thread.sleep(10000);
        rp2.setHoraSaida(java.time.LocalDateTime.now());
        rp2.apresentarRegistroPonto();

        RegistroPonto rp3 = new RegistroPonto();
        rp3.setFunc(o1);
        rp3.setDataRegistro(java.time.LocalDate.now());
        rp3.setHoraEntrada(java.time.LocalDateTime.now());
        Thread.sleep(10000);
        rp3.setHoraSaida(java.time.LocalDateTime.now());
        rp3.apresentarRegistroPonto();

    }
}
