package Lista03;
public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Data:" + dia + "/" + mes + "/" + ano + "\n";
        s += "Validação: "+mostrarValidação();
        return s;
    }

    public String mostrarValidação(){
        if(validar()){
            return "Data correta";
        }else{
            return "Data incorreta";
        }
    }
    public boolean validar() {
        return dia>=01 && dia <= 31 && mes>= 01 && mes <= 12 && ano>=1900 &&ano <= 2019 ;
    }

}
