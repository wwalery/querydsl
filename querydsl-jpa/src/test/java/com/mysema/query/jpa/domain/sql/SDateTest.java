package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * SDateTest is a Querydsl query type for SDateTest
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class SDateTest extends com.mysema.query.sql.RelationalPathBase<SDateTest> {

    private static final long serialVersionUID = -1879688879;

    public static final SDateTest dateTest1 = new SDateTest("DATE_TEST");

    public final DatePath<java.sql.Date> dateTest = createDate("DATE_TEST", java.sql.Date.class);

    public SDateTest(String variable) {
        super(SDateTest.class, forVariable(variable), "null", "DATE_TEST");
    }

    public SDateTest(Path<? extends SDateTest> path) {
        super(path.getType(), path.getMetadata(), "null", "DATE_TEST");
    }

    public SDateTest(PathMetadata<?> metadata) {
        super(SDateTest.class, metadata, "null", "DATE_TEST");
    }

}

