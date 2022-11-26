class Clientes implements Comparable{
    String nome;
    int telefone;
    public String getName() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public int getPhone() {
        return telefone;
    }
    public void setPhone(int telefone) {
        this.telefone = telefone;
    }
    @Override
    public int compareTo(Object arg0) {
        Clientes p = (Clientes)arg0;
        return p.getPhone();
    }
}
