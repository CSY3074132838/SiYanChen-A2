public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("部分三：创建员工和游客的对象，并展示其信息");
        Employee employee = new Employee("张三", 30, "北京市", "E123", "骑行员");
        Visitor visitor = new Visitor("李四", 25, "上海市", "V456", "年卡");
        System.out.println("员工: " + employee.getName() + ", " + employee.getPosition());
        System.out.println("游客: " + visitor.getName() + ", " + visitor.getMembershipType());

        System.out.println("部分四A：展示游乐设施的状态");
        Employee operator = new Employee("王五", 35, "广州市", "E789", "管理员");
        Ride ride = new Ride("过山车", true, operator);
        System.out.println("游乐设施名称: " + ride.getRideName() + ", 是否开放: " + (ride.isOpen() ? "是" : "否"));

        System.out.println("部分四B：展示员工信息");
        Employee employee2 = new Employee("赵六", 28, "深圳市", "E101", "维修员");
        System.out.println("员工名称: " + employee2.getName() + ", 职位: " + employee2.getPosition());

        System.out.println("部分五：展示游客信息");
        Visitor visitor2 = new Visitor("周七", 22, "天津市", "V202", "普通票");
        System.out.println("游客名称: " + visitor2.getName() + ", 票种: " + visitor2.getMembershipType());

        System.out.println("部分六：模拟一项游乐设施的操作");
        Employee operator2 = new Employee("孙八", 32, "重庆市", "E303", "操作员");
        Ride ride2 = new Ride("水上漂流", false, operator2);
        System.out.println("游乐设施名称: " + ride2.getRideName() + ", 是否开放: " + (ride2.isOpen() ? "是" : "否"));

        System.out.println("部分七：演示完整的员工与游客交互");
        Employee employee3 = new Employee("李九", 40, "南京市", "E404", "主管");
        Visitor visitor3 = new Visitor("钱十", 18, "合肥市", "V505", "VIP");
        System.out.println("员工与游客的互动: " + employee3.getName() + " 与 " + visitor3.getName() + " 正在交谈.");
    }
}
