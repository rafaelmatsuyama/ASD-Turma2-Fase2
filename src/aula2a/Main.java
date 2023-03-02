package aula2a;

import java.sql.*;

public class Main {
    public static void inserirRegistro(Statement statement, String sql) throws SQLException {
        int rows = statement.executeUpdate(sql);

        if (rows > 0) {
            System.out.println("Registro inserido!");
        }
    }
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:h2:mem:test";
        Connection connection = DriverManager.getConnection(jdbcURL);
        System.out.println("Conectado ao Banco de Dados!");

        String sql = "CREATE TABLE carrinho (" +
                " id INTEGER PRIMARY KEY," +
                " nome_produto VARCHAR(255) NOT NULL," +
                " quantidade INTEGER NOT NULL," +
                " preco numeric(6, 2) NOT NULL)";

        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Tabela criada!");

        sql = "INSERT INTO carrinho VALUES (1, 'Nutella', 5, 36.00)";
        Main.inserirRegistro(statement, sql);

        sql = "INSERT INTO carrinho VALUES (2, 'iPhone 12s', 10, 4000.00)";
        Main.inserirRegistro(statement, sql);

        sql = "INSERT INTO carrinho VALUES (3, 'Toblerone', 5, 25.00)";
        Main.inserirRegistro(statement, sql);

        sql = "INSERT INTO carrinho VALUES (4, 'RTX 3070 TI', 2, 4600.00)";
        Main.inserirRegistro(statement, sql);

        sql = "SELECT * FROM carrinho";

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()) {
            count++;

            int id = resultSet.getInt("id");
            String nome_produto = resultSet.getString("nome_produto");
            int quantidade = resultSet.getInt("quantidade");
            double preco = resultSet.getDouble("preco");
            System.out.println("Produto #" + id + ": " + nome_produto +
                    ", " + quantidade + " unidade(s) ao preço de R$ " + preco);
        }

        connection.close();
    }
}