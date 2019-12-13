package com.example.demo.bigtalkdesignpatterns.combinationpatterns;

/**
 * 组合模式测试类
 * @author xsy
 */
public class CombinationTest {

    public static void main(String[] args) {
//        Composite root = new Composite("root");
//        root.add(new Leaf("Leaf A"));
//        root.add(new Leaf("Leaf B"));
//
//        Composite comp = new Composite("Composite X");
//        comp.add(new Leaf("Leaf XA"));
//        comp.add(new Leaf("Leaf XB"));
//
//        root.add(comp);
//
//        Composite comp2 = new Composite("Composite XY");
//        comp2.add(new Leaf("Leaf XYA"));
//        comp2.add(new Leaf("Leaf XYB"));
//
//        comp.add(comp2);
//
//        root.add(new Leaf("Leaf C"));
//
//        Leaf leaf = new Leaf("Leaf D");
//        root.add(leaf);
//
//        root.remove(leaf);
//
//        root.display(1);
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HrDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HrDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HrDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp1.add(comp2);
        System.out.println("\n结构图：");
        root.display(1);
        System.out.println("\n职责：");
        root.lineOfDuty();

    }

}
