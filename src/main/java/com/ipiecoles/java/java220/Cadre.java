package com.ipiecoles.java.java220;

import com.ipiecoles.java.java220.Technicien ;
import exemple.Entreprise;
import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

    private HashSet<Technicien> equipe = new HashSet();

    public Manager() {

    }

    public Manager(String name, String firstname, String register, LocalDate dateHiring, Double pay, HashSet<Technicien> equipe) {
        super(name, firstname, register, dateHiring, pay);
        this.equipe = equipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien) {
        equipe.add(technicien);
    }

    public void ajoutTechTeam(String name, String firstname, String register, LocalDate dateHiring, Double pay, Integer grade) throws TechnicienException {
        this.ajoutTechnicienEquipe(new Technicien(name, firstname, register, dateHiring, pay, grade));
    }

    public void setSalary(Double salaire) {
        super((salaireEquipeGrade1() * Entreprise.INDICE_MANAGER) + ((salaire * (double) equipe.size()) / 10));
    }

    public Double getPrimeYearly() {
        return Entreprise.primeAnnuelleBase() + equipe.size() * Entreprise.PRIME_MANAGER_PAR_TECHNICIEN;
    }

    public void augmenterSalary(Double pourcentage) {
        augmenterSalaireEquipe(pourcentage);
    }

    private void augmenterSalaireEquipe(Double pourcentage) {
        for (Technicien technicien : equipe) {
        }
    }

    public List<Technicien> equipeParGrade() {
        return equipe.stream().sorted(Technicien::compareTo).collect(Collectors.toList());
    }

    public double salaireEquipeGrade1() {
        return equipe.stream().filter(t -> t.getGrade().equals(1)).mapToDouble(Technicien::getSalaire).sum();
    }

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Manager{} " + super.toString();
    }
}
