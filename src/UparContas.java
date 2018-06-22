import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class UparContas {
	private static Robot clicker = null;
	private static Robot keyboard = null;
	private static int casas = 16;
	private static ArrayList<String> accs = new ArrayList<String>();
	private static boolean temUmPF = true;

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\accs.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.length() > 0 && line.startsWith("/")) {
					accs.add(line.substring(1, line.length()));
				}
			}
		}

		for (int i = 0; i < accs.size(); i++) {
			System.out.println(accs.get(i).toUpperCase());
			executarPassos(accs.get(i));
			wait(2);
		}

	}

	public static void executarPassos(String acc) throws AWTException, IOException, HeadlessException, InterruptedException {

		campoLogin(acc);
		escrever(acc);
		login(acc);
		jogar(acc);
		houndsmoor(acc);
		wait(10);
		fecharJanela(acc);
		pesquisa(acc);
		temUmPF = temUmPf("Verificando se tem PF", acc);
		while (temUmPF) {
			procurarPesquisa(acc);
			useXPontos(acc);
			useUmPonto(acc);
			desbloquearAgora("Teste");
			okVerde(acc);
			temUmPf(acc, acc);
		}
		voltarACidade(acc);
		fecharJanela(acc);
		logout(acc);
		sair(acc);
		sair2(acc);

	}

	public static boolean temUmPf(String acao, String acc) throws HeadlessException, AWTException, IOException {
		BufferedImage bi = ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\temUmPF.png"));
		temUmPF = esperarImagem(bi, acao, acc);
		return temUmPF;
	}

	public static void procurarPFnaPesquisa(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		zeroCinco(acc);
		zeroSeis(acc);
		zeroSete(acc);
		zeroOito(acc);
		zeroNove(acc);
		zeroDez(acc);
		zeroDoze(acc);
		umCinco(acc);
		umSeis(acc);
		umSete(acc);
		umOito(acc);
		umNove(acc);
		umDez(acc);
		umDoze(acc);
		doisCinco(acc);
		doisSeis(acc);
		doisSete(acc);
		doisOito(acc);
		doisNove(acc);
		doisDez(acc);
		doisDoze(acc);
		tresCinco(acc);
		tresSeis(acc);
		tresSete(acc);
		tresOito(acc);
		tresNove(acc);
		tresDez(acc);
		tresDoze(acc);
		quatroCinco(acc);
		quatroSeis(acc);
		quatroSete(acc);
		quatroOito(acc);
		quatroNove(acc);
		quatroDez(acc);
		quatroDoze(acc);
		cincoSeis(acc);
		cincoSete(acc);
		cincoOito(acc);
		cincoNove(acc);
		cincoDez(acc);
		cincoDoze(acc);
		seisSete(acc);
		seisOito(acc);
		seisNove(acc);
		seisDez(acc);
		seisDoze(acc);
		seteOito(acc);
		seteNove(acc);
		seteDez(acc);
		seteDoze(acc);
		oitoNove(acc);
		oitoDez(acc);
		oitoDoze(acc);
		noveDez(acc);
		noveDoze(acc);
		dezDoze(acc);
		onzeDoze(acc);
	}

	public static void procurarPesquisa(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		telaPraEsquerda(acc);
		fecharJanela(acc);
		procurarPFnaPesquisa(acc);
		fecharJanela(acc);
		telaPraDireita(acc);
		procurarPFnaPesquisa(acc);
	}

	public static void useUmPonto(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\useUmPonto.png")), "useUmPonto", acc);
	}

	public static void desbloquearAgora(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\desbloquearAgora.png")), "desbloquearAgora", acc);
	}

	//
	public static void telaPraDireita(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\telaPraDireita.png")), "telaPraDireita", acc);
	}

	public static void telaPraEsquerda(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\telaPraEsquerda.png")), "telaPraEsquerda", acc);
	}

	public static void onzeDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\onzeDoze.png")), "onzeDoze", acc);
	}

	public static void dezDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\dezDoze.png")), "dezDoze", acc);
	}

	public static void noveDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\noveDoze.png")), "noveDoze", acc);
	}

	public static void oitoDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\oitoDoze.png")), "oitoDoze", acc);
	}

	public static void seteDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seteDoze.png")), "seteDoze", acc);
	}

	public static void seisDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seisDoze.png")), "seisDoze", acc);
	}

	public static void cincoDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoDoze.png")), "cincoDoze", acc);
	}

	public static void quatroDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroDoze.png")), "quatroDoze", acc);
	}

	public static void tresDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresDoze.png")), "tresDoze", acc);
	}

	public static void doisDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisDoze.png")), "doisDoze", acc);
	}

	public static void umDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umDoze.png")), "umDoze", acc);
	}

	public static void zeroDoze(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroDoze.png")), "zeroDoze", acc);
	}

	public static void noveDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\noveDez.png")), "noveDez", acc);
	}

	public static void oitoDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\oitoDez.png")), "oitoDez", acc);
	}

	public static void seteDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seteDez.png")), "seteDez", acc);
	}

	public static void seisDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seisDez.png")), "seisDez", acc);
	}

	public static void cincoDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoDez.png")), "cincoDez", acc);
	}

	public static void quatroDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroDez.png")), "quatroDez", acc);
	}

	public static void tresDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresDez.png")), "tresDez", acc);
	}

	public static void doisDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisDez.png")), "doisDez", acc);
	}

	public static void umDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umDez.png")), "umDez", acc);
	}

	public static void zeroDez(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroDez.png")), "zeroDez", acc);
	}

	public static void oitoNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\oitoNove.png")), "oitoNove", acc);
	}

	public static void seteNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seteNove.png")), "seteNove", acc);
	}

	public static void seisNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seisNove.png")), "seisNove", acc);
	}

	public static void cincoNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoNove.png")), "cincoNove", acc);
	}

	public static void quatroNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroNove.png")), "quatroNove", acc);
	}

	public static void tresNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresNove.png")), "tresNove", acc);
	}

	public static void doisNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisNove.png")), "doisNove", acc); // achouPesquisa = true;
	}

	public static void umNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umNove.png")), "umNove", acc);
	}

	public static void zeroNove(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroNove.png")), "zeroNove", acc);
	}

	public static void seteOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seteOito.png")), "seteOito", acc);
	}

	public static void seisOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seisOito.png")), "seisOito", acc);
	}

	public static void cincoOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoOito.png")), "cincoOito", acc);
	}

	public static void quatroOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroOito.png")), "quatroOito", acc);
	}

	public static void tresOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresOito.png")), "tresOito", acc);
	}

	public static void doisOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisOito.png")), "doisOito", acc);
	}

	public static void umOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umOito.png")), "umOito", acc);
	}

	public static void zeroOito(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroOito.png")), "zeroOito", acc);
	}

	public static void cincoSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoSete.png")), "cincoSete", acc);
	}

	public static void seisSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\seisSete.png")), "seisSete", acc);
	}

	public static void quatroSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroSete.png")), "quatroSete", acc);
	}

	public static void tresSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresSete.png")), "tresSete", acc);
	}

	public static void doisSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisSete.png")), "doisSete", acc);
	}

	public static void umSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umSete.png")), "umSete", acc);
	}

	public static void zeroSete(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroSete.png")), "zeroSete", acc);
	}

	public static void cincoSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\cincoSeis.png")), "cincoSeis", acc);
	}

	public static void quatroSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroSeis.png")), "quatroSeis", acc);
	}

	public static void tresSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresSeis.png")), "tresSeis", acc);
	}

	public static void doisSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisSeis.png")), "doisSeis", acc);
	}

	public static void umSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umSeis.png")), "umSeis", acc);
	}

	public static void zeroSeis(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroSeis.png")), "zeroSeis", acc);
	}

	public static void quatroCinco(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\quatroCinco.png")), "quatroCinco", acc);
	}

	public static void tresCinco(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\tresCinco.png")), "tresCinco", acc);
	}

	public static void doisCinco(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\doisCinco.png")), "doisCinco", acc);
	}

	public static void umCinco(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\umCinco.png")), "umCinco", acc);
	}

	public static void zeroCinco(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarInstant(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\UparContas\\zeroCinco.png")), "zeroCinco", acc);
	}

	public static void recarregar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\recarregar.png")), "recarregar", acc);
	}

	public static void desmarcarOpcao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\desmarcarOpcao.png")), "desmarcarOpcao", acc);
	}

	public static void configuracoes(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\configuracoes.png")), "configuracoes", acc);
	}

	public static void idadeDaPedra(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\idadeDaPedra.png")), "idadeDaPedra", acc);
	}

	public static void voltarACidade2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade2.png")), "voltarACidade2", acc);
	}

	public static void voltarParaVisaoGeral(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarParaVisaoGeral.png")), "voltarParaVisaoGeral", acc);
	}

	public static void useXPontos(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\useXPontos.png")), "useXPontos", acc);
	}

	public static void pesquisaRoda(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaRoda.png")), "pesquisaRoda", acc);
	}

	public static void pesquisaOlaria(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaOlaria.png")), "pesquisaOlaria", acc);
	}

	public static void auxiliar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\auxiliar.png")), "auxiliar", acc);
		Thread.sleep(1000);
	}

	public static void sentarNaTaberna(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\sentarNaTaberna.png")), "sentarNaTaberna", acc);
		Thread.sleep(1000);
	}

	public static void atacarInimigo2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo2.png")), "atacarInimigo2", acc);
	}

	public static void atacarInimigo1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo1.png")), "atacarInimigo1", acc);
	}

	public static void moverLanceiro2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro2.png")), "moverLanceiro2", acc);
	}

	public static void moverLanceiro1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro1.png")), "moverLanceiro1", acc);
	}

	public static void botaoAtacarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacarVerde.png")), "botaoAtacarVerde", acc);
	}

	public static void lanceiro(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\lanceiro.png")), "lanceiro", acc);
	}

	public static void botaoAtacar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacar.png")), "botaoAtacar", acc);
	}

	public static void setor1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\setor1.png")), "setor1", acc);
	}

	public static void provincia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\provincia.png")), "provincia", acc);
	}

	public static void explorar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\explorar.png")), "explorar", acc);
	}

	public static void mapa(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mapa.png")), "mapa", acc);
	}

	public static void pesquisaLancas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaLancas.png")), "pesquisaLancas", acc);
	}

	public static void colocarCasaGrande(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCasaGrande.png")), "colocarCasaGrande", acc);
	}

	public static void casaGrandeMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaGrandeMenu.png")), "casaGrandeMenu", acc);
	}

	public static void coletarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarVerde.png")), "coletarVerde", acc);
	}

	public static void historia2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia2.png")), "historia2", acc);
	}

	public static void colocarPalafita(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarPalafita.png")), "colocarPalafita", acc);
	}

	public static void palafitaMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\palafitaMenu.png")), "palafitaMenu", acc);
	}

	public static void casaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaMenu.png")), "casaMenu", acc);
	}

	public static void historia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia.png")), "historia", acc);
	}

	public static void colocarMemorial(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarMemorial.png")), "colocarMemorial", acc);
	}

	public static void memorialMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\memorialMenu.png")), "memorialMenu", acc);
	}

	public static void decoracaoMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\decoracaoMenu.png")), "decoracaoMenu", acc);
	}

	public static void voltarACidade(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade.png")), "voltarACidade", acc);
	}

	public static void fecharVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\fecharVerde.png")), "fecharVerde", acc);
	}

	public static void abrirOBau(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\abrirOBau.png")), "abrirOBau", acc);
	}

	public static void okVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\okVerde.png")), "okVerde", acc);
	}

	public static void use3Pontos(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\use3Pontos.png")), "use3Pontos", acc);
	}

	public static void pesquisaPalafitas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaPalafitas.png")), "pesquisaPalafitas", acc);
	}

	public static void fecharJanela(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fecharJanela.png")), "Fechar janela", acc);
	}

	public static void abrir(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\abrir.png")), "Abrir", acc);
	}

	public static void logout(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\logout.png")), "Logout", acc);
	}

	public static void sair(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair.png")), "Sair", acc);
	}

	public static void sair2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair2.png")), "Sair2", acc);
	}

	public static void tirarMusica(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarMusica.png")), "tirarMusica", acc);
	}

	public static void tirarSom(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarSom.png")), "tirarSom", acc);
	}

	public static void ok(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\ok.png")), "ok", acc);
	}

	public static void construir(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\construir.png")), "construir", acc);
	}

	public static void cabanaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cabanaMenu.png")), "cabanaMenu", acc);
	}

	public static void colocarCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCabana.png")), "colocarCabana", acc);
	}

	public static void coletarPrimeiraCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarPrimeiraCabana.png")), "coletarPrimeiraCabana", acc);
	}

	public static void mantimentosMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mantimentosMenu.png")), "mantimentosMenu", acc);
	}

	public static void cacadorMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorMenu.png")), "cacadorMenu", acc);
	}

	public static void colocarCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCacador.png")), "colocarCacador", acc);
	}

	public static void botaoMover(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoMover.png")), "botaoMover", acc);
	}

	public static void pegarCacadorEmConstrucao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pegarCacadorEmConstrucao.png")), "pegarCacadorEmConstrucao", acc);
	}

	public static void moverCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverCacador.png")), "moverCacador", acc);
	}

	public static void cacadorEsperando(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorEsperando.png")), "cacadorEsperando", acc);
	}

	public static void cincoMin(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cincoMin.png")), "cincoMin", acc);
	}

	public static void pesquisa(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisa.png")), "pesquisa", acc);
	}

	public static void campoLogin(String acc) throws HeadlessException, AWTException, IOException {
		clicarLogin(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\campoLogin.png")), "Campo Login", acc);
	}

	public static void login(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\login.png")), "Login", acc);
	}

	public static void jogar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\jogar.png")), "Jogar", acc);
	}

	public static void houndsmoor(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\houndsmoor.png")), "Houndsmoor", acc);
	}

	public static void abrirMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\cidadeDe.png")), "Cidade de", acc);
	}

	public static void noticias(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\noticias.png")), "Noticias", acc);
	}

	public static void grandesEdificios(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\grandesEdificios.png")), "Grandes Edificios", acc);
	}

	public static void todaABarra(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\todaABarra.png")), "Toda a barra", acc);
	}

	public static void todaABarra10(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\todaABarra10.png")), "Toda a barra10", acc);
	}

	public static void escrever(String string) throws AWTException {
		apagar();
		digitar(string);
	}

	public static void digitar(String nome) throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < nome.length(); i++) {
			char[] chars = nome.toUpperCase().toCharArray();
			switch (chars[i]) {
			case 'Ã':
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_A);
				keyboard.keyRelease(KeyEvent.VK_A);
				keyboard.delay(20);
				break;
			case 'Ê':
				keyboard.keyPress(KeyEvent.VK_SHIFT);
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_SHIFT);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_E);
				keyboard.keyRelease(KeyEvent.VK_E);
				keyboard.delay(20);
				break;
			default:
				keyboard.keyPress(chars[i]);
				keyboard.keyRelease(chars[i]);
			}
			keyboard.delay(20);
		}
	}

	public static void apagar() throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < 20; i++) {
			keyboard.keyPress(KeyEvent.VK_BACK_SPACE);
			keyboard.delay(20);
		}
	}

	public static void wait(int segundos) throws AWTException {
		clicker = new Robot();
		System.out.print("Wait " + segundos + "s: ");
		for (int i = 0; i < segundos - 1; i++) {
			clicker.delay(1000);
			System.out.print(i + 1 + ", ");
		}
		clicker.delay(1000);
		System.out.println(segundos);
	}

	public static void clickEvent(double x, double y) throws AWTException {
		clicker = new Robot();
		clicker.mouseMove((int) x, (int) y);
		clicker.delay(500);
		clicker.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		clicker.delay(20);
		clicker.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}

	public static void zoomIn() throws AWTException {
		clicker = new Robot();
		clicker.delay(500);
		clicker.mouseWheel(-50);
		clicker.delay(200);
	}

	public static void zoomOut() throws AWTException {
		clicker = new Robot();
		clicker.mouseWheel(50);
		clicker.delay(200);
	}

	public static void aguardar(ArrayList<BufferedImage> bi, String acao, String acc) throws HeadlessException, AWTException {

		boolean achouUm = false;
		while (!achouUm) {
			achouUm = achouUm || esperarImagem(bi.get(1), acao, acc);
			achouUm = achouUm || esperarImagem(bi.get(0), acao, acc); // Só procura a segunda imagem quando acha a
																		// primeira
		}
	}

	public static void clicar(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		if (acao == "lanceiro") {
			for (int i = 0; i < 1; i++) {
				compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
			}
		}
		compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
	}

	public static void clicarRapido(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.5, 0.5, 0, 10, acao, acc);
	}

	public static void clicarInstant(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.5, 0.5, 0, 1, acao, acc);
	}

	public static void clicarLogin(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.6, 0.3, 0, 30, acao, acc);
	}

	public static void clicarColeta(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		zoomIn();
		for (int i = 0; i < casas; i++) {
			compararImagens(bi, 0.6, 0.1, 0, 2, acao + (i + 1), acc);
		}
		wait(3);
		zoomOut();
	}

	public static boolean esperarImagem(BufferedImage bi, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		int count = 0;
		while (achou == false && count < 10) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}
					if (!invalid) {
						achou = true;
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
			count++;
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
			achou = false;
		}
		return achou;
	}

	public static void compararPixels(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		boolean achouUm = false;
		while (achou == false && count < maxCount) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}

					if (!invalid && !achouUm) {
						achou = true;
						achouUm = true;
						clickEvent(k - (bi.getWidth() * widthMult), l - (bi.getHeight() * heigthMult)); // Clica no centro do objeto
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
			count++;
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
		}
	}

	public static void compararImagens(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException, IOException {
		if (acao == "Auxiliar") {
			for (int i = 0; i < 5; i++) {
				compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
				clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fechar.png")), "Fechar", acc);
			}
		} else {
			compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
		}
	}
}