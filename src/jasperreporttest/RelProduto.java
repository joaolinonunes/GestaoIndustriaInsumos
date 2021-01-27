/**
* Este programa exemplifica a execução de um relatório desenhado e programado
* por meio do Jaspersoft Studio, empregando a JasperReport Library 6.16.
**
O relatório deste exemplo não possui recursos avançados como gráficos.
* O uso de modelo mais avançados pode requerer outros .JAR da
* JasperReport Library.
**
Obs.: Alguns WARNINGS são observados na execução, mas estes não impedem o
* funcionamento deste exemplo.
**
@author prof. Osvandre Martins
* @date 10/12/2020
*
*/

package jasperreporttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class RelProduto {
    public static void main(String[] args) {
        try {
            //Cria uma instância desta classe para poder usar o método getClass()
            //Em métodos de JFrames, por exemplo, no lugar de jrt pode-se...
            //...empregar o comando "this" (this.getClass().getResource(...)).
            RelCliente jrt = new RelCliente();
            //O método getResource(...) procura por um recurso (arquivo)...
            //..a partir do diretório onde está a classe retornando sua URL.
            URL url = jrt.getClass().getResource("./reports/relProduto.jrxml");
            //A URL do recurso precisa ser convertida para path de arquivo.
            //String path = Paths.of(url.toURI()).toString();
            String path = Paths.get(url.toURI()).toString();
            System.out.println("Path para o JRXML: "+path);
            //Conexão com banco de dados - Mesma configuração usada para...
            //...conectar a origem dos dados no Repository Explorer do...
            //...Jaspersoft Studio.
            Connection con = null;
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdprocessodeproducao","postgres","lara2011");
            //Compila o relatório conforme o arquivo JRXML presente no path.
            JasperReport jr = JasperCompileManager.compileReport(path);
            //Preenche o relatório com dados conforme a consulta SQL presente...
            //...no JRXML e a conexão com BD estabelecida.
            JasperPrint jp = JasperFillManager.fillReport(jr,null, con);
            //Executa o visualizador de relatórios do Jasper (JasperViewer).
            JasperViewer.viewReport(jp);
            //Fecha a conexão com BD.
            con.close();
        } catch(Exception ex) {
        ex.printStackTrace();
        }  
    }
}