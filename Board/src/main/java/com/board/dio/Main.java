package com.board.dio;

import com.board.dio.persistence.config.ConnetionConfig;
import com.board.dio.persistence.migration.MigrationStratey;

public class Main {
    public static void main(String[] args) throws Exception{
        try(var connection = ConnetionConfig.getConnection()){
            new MigrationStratey(connection).executeMigration();
        }
    }
}
