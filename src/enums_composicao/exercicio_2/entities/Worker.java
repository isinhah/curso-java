package src.enums_composicao.exercicio_2.entities;

import src.enums_composicao.exercicio_2.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//Possui 1 departamento (Department) e vários contratos (HourContract)
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Composição de objetos -> Associação com o department
    private Department department;

    // Composição de objetos -> Associação com contratos (não incluir lista no construtor)
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Adicionar contrato à lista de contratos (associa o trabalhador)
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    // Remover contrato da lista de contratos (tira a associação do trabalhador)
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    // Salário baseado no ano e mês
    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}
