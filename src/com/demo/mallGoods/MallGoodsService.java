package com.demo.mallGoods;


import com.demo.common.model.MallGoods;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;

public class MallGoodsService {

    public static final MallGoodsService me = new MallGoodsService();

    private MallGoods mDao = new MallGoods().dao();

    public Page<MallGoods> getPaginte(int pageNumber,int pageSize){
        String from = " from t_mall_goods order by create_time desc";
        String totalRowSql = "select count(*) " + from;
        String findSql = "select goods_title,promotion_price,goods_price,logistics_weigth,create_time,is_putaway" + from;
        return mDao.paginateByFullSql(pageNumber, pageSize, totalRowSql, findSql);
    }

    public static void main(String[] args) {
       // ins_isIns_isAss();
      /*  stringS();
        stringBulderS();
        stringBufferS();*/
        test();
    }

    private static void test(){
        StringBuffer sqlTest = new StringBuffer("select u.*, ");
        sqlTest.append(" case when u.userType =1 then shipper.agencyShortName ");
        sqlTest.append(" when u.userType in(2,3) then carrier.agencyShortName ");
        sqlTest.append("  when u.userType =7 then g.agencyShortName ");
        sqlTest.append(" else 'ES云平台' end agencyShortName ,");
        sqlTest.append(" case when u.userType =1 then shipper.agencyName ");
        sqlTest.append(" when u.userType in(2,3) then carrier.agencyName ");
        sqlTest.append("  when u.userType =7 then g.orgName ");
        sqlTest.append(" else 'ES云平台' end agencyName ");
        sqlTest.append(" from common_user u");
        sqlTest.append(" left join shipper shipper on u.agencyId = shipper.id ");
        sqlTest.append(" left join carrier carrier on u.agencyId = carrier.id ");
        sqlTest.append(" left join shipper ss on u.agencyId = ss.id ");
        sqlTest.append(" left join gov g on u.agencyId = g.id ");

        sqlTest.append(" where u.account = ? or u.phone = ?");
        System.out.println(sqlTest.toString());
    }

    private static void ins_isIns_isAss(){
        /*instanceof运算符 只被用于对象引用变量，检查左边的被测试对象 是不是 右边类或接口的 实例化。如果被测对象是null值，则测试结果总是false。
        形象地：自身实例或子类实例 instanceof 自身类  返回true
        例：*/
        String s=new String("javaisland");
        String s3 = null;
        System.out.print("instanceof运算符:"); //true
        System.out.println(s instanceof String);
        System.out.print("instanceof运算符:"); //false
        System.out.println(s3 instanceof String);
        /*Class类的isInstance(Object obj)方法，obj是被测试的对象，如果obj是调用这个方法的class或接口 的实例，则返回true。这个方法是instanceof运算符的动态等价。
        形象地：自身类.class.isInstance(自身实例或子类实例)  返回true
        例：*/
        String s2=new String("javaisland");
        System.out.print("Class类的isInstance:"); //true
        System.out.println(String.class.isInstance(s2));
        System.out.print("Class类的isInstance:"); //false
        System.out.println(StringBuilder.class.isInstance(s2));

       /* Class类的isAssignableFrom(Class cls)方法，如果调用这个方法的class或接口 与 参数cls表示的类或接口相同，或者是参数cls表示的类或接口的父类，则返回true。
        形象地：自身类.class.isAssignableFrom(自身类或子类.class)  返回true
        例：*/
       System.out.println(ArrayList.class.isAssignableFrom(Object.class));  //false
        System.out.println(Object.class.isAssignableFrom(ArrayList.class));  //true
    }

    private static void stringS(){
        //第一种是以毫秒为单位计算的。
        long startTime=System.currentTimeMillis();   //获取开始时间

        String sql="" +
                "SELECT " +
                "  c.roleId, " +
                "  LEFT ( " +
                "   c.roleResourceIds, " +
                "   LEN(c.roleResourceIds) - 1 " +
                " ) AS roleResourceIdstr " +
                "FROM " +
                " ( " +
                "   SELECT " +
                "    a.roleId, " +
                "   ( " +
                "     SELECT " +
                "      CAST (b.resourceId AS VARCHAR) + ',' " +
                "     FROM " +
                "      system_role_resource b " +
                "     WHERE " +
                "      a.roleId = b.roleId FOR XML PATH ('') " +
                "   ) AS roleResourceIds " +
                "   FROM " +
                "    system_role_resource a " +
                "   GROUP BY " +
                "    a.roleId " +
                " ) c WHERE c.roleId = ?";

        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("String MS ： "+(endTime-startTime)+"ms");

        //第二种是以纳秒为单位计算的。

        long startTimens=System.nanoTime();   //获取开始时间

        String str2 = "";//"123"+"2324324"+"魂牵梦萦魂牵梦萦"+"fdfdsafdsafdsa"+"魂牵梦萦魂牵梦萦魂牵梦萦";

        String str3 = "[fdsafdsafdsafdsafdsafdsa]";
        str2 =str2+"2324324";
        str2+="魂牵梦萦魂牵梦萦";
        str2+="fdfdsafdsafdsa";
        str2+="魂牵梦萦魂牵梦萦魂牵梦萦";
        long endTimens=System.nanoTime(); //获取结束时间

        System.out.println("String NS： "+(endTimens-startTimens)+"ns");

    }

    private static void stringBufferS(){
        //第一种是以毫秒为单位计算的。
        long startTime=System.currentTimeMillis();   //获取开始时间

        StringBuffer sbf = new StringBuffer();
        sbf.append("123");
        sbf.append("2324324");
        sbf.append("魂牵梦萦魂牵梦萦");
        sbf.append("fdfdsafdsafdsa");
        sbf.append("魂牵梦萦魂牵梦萦魂牵梦萦");
        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("StringBuffer MS： "+(endTime-startTime)+"ms");

        //第二种是以纳秒为单位计算的。

        long startTimens=System.nanoTime();   //获取开始时间

        StringBuffer sbf2 = new StringBuffer();
        sbf.append("123");
        sbf.append("2324324");
        sbf.append("魂牵梦萦魂牵梦萦");
        sbf.append("fdfdsafdsafdsa");
        sbf.append("魂牵梦萦魂牵梦萦魂牵梦萦");

        long endTimens=System.nanoTime(); //获取结束时间

        System.out.println("StringBuffer NS： "+(endTimens-startTimens)+"ns");

    }

    private static void stringBulderS(){
        //第一种是以毫秒为单位计算的。
        long startTime=System.currentTimeMillis();   //获取开始时间

        StringBuilder sbf = new StringBuilder();
        sbf.append("123");
        sbf.append("2324324");
        sbf.append("魂牵梦萦魂牵梦萦");
        sbf.append("fdfdsafdsafdsa");
        sbf.append("魂牵梦萦魂牵梦萦魂牵梦萦");

        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("StringBuilder MS： "+(endTime-startTime)+"ms");

        //第二种是以纳秒为单位计算的。

        long startTimens=System.nanoTime();   //获取开始时间

        StringBuilder sbf2 = new StringBuilder();
        sbf.append("123");
        sbf.append("2324324");
        sbf.append("魂牵梦萦魂牵梦萦");
        sbf.append("fdfdsafdsafdsa");
        sbf.append("魂牵梦萦魂牵梦萦魂牵梦萦");

        long endTimens=System.nanoTime(); //获取结束时间

        System.out.println("StringBuilder NS： "+(endTimens-startTimens)+"ns");
    }
}

