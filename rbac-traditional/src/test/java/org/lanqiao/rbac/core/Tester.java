package org.lanqiao.rbac.core;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:spring-context.xml")
@ActiveProfiles("dev1")
public class Tester extends AbstractJUnit4SpringContextTests {
}
