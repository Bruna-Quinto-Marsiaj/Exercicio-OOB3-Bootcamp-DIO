package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); //sem upcast ou downcast. pegou funcionário e estanciou obj dele

        Funcionario gerente = new Gerente(); //upcast. é implicito, quer transformar gerente em funcionario
        Funcionario vendedor = new Vendedor(); //upcast facilita o polimorfismo...
        Funcionario faxineiro = new Faxineiro(); //upcast

        //Gerente gerente_ = new Funcionario();// forma errada de fazer pq downcast precisa ser explícito
        Vendedor vendedor_ = (Vendedor) new Funcionario();//downcast, classe mãe, funcionario, sendo transf em filha. downcast geralmente da erro, 
                                                          //pq perde dados, pq na subclasse tem dados q n tem na super

    }
}
