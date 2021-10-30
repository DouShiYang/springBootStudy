//package com.doushiyang.springBootStudy.generatorCode;
//
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import org.apache.ibatis.jdbc.ScriptRunner;
//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class FastAutoGeneratorTest {
//
//    /**
//     * 执行初始化数据库脚本
//     */
//    public static void before() throws SQLException {
//        Connection conn = DATA_SOURCE_CONFIG.build().getConn();
//        InputStream inputStream = H2CodeGeneratorTest.class.getResourceAsStream("/sql/init.sql");
//        ScriptRunner scriptRunner = new ScriptRunner(conn);
//        scriptRunner.setAutoCommit(true);
//        scriptRunner.runScript(new InputStreamReader(inputStream));
//        conn.close();
//    }
//
//    /**
//     * 数据源配置
//     */
//    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
//            .Builder("jdbc:mysql://47.105.170.93:3306/test", "root", "u2)zwMupyjWq");
//
//    /**
//     * 执行 run
//     */
//    public static void main(String[] args) throws SQLException {
////        before();
//        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
//                // 全局配置
//                .globalConfig((scanner, builder) -> builder.author(scanner.apply("DOU士.杨")).fileOverride().enableSwagger()
//                        .commentDate("yyyy-MM-dd").dateType(DateType.TIME_PACK))
//                // 包配置
//                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("com.doushiyang.springbootstudy")))
//                // 策略配置
//                .strategyConfig(builder -> builder.addInclude("student").addInclude("t_simple"))
//                /*
//                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
//                   .templateEngine(new BeetlTemplateEngine())
//                   .templateEngine(new FreemarkerTemplateEngine())
//                 */
//                .execute();
//    }
//}
