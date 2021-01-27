/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.repositories;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import pt.ipp.isep.apoo.classes.Patient;
import pt.ipp.isep.apoo.classes.Schedule;
import java.util.stream.IntStream; 



/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class AllSchedules {

    private static ArrayList<Schedule> schedules = new ArrayList<Schedule>();
    private static int count = 0;
    

    public static void addScheduleToAllSchedules(Schedule s) {
        System.out.println(s.toString());
        schedules.add(s);
        
    }

    // itera o array de Schedules e quando encontrar uma instância do objecto Schedule com Paciente igual ao parâmetro, devolve a instância do Schedule.
    public static Schedule getScheduleByPatiente(Patient p) {
       for(Schedule schedule: schedules){
             if (schedule.getPatient().equals(p)) {
                System.out.println(schedule.toString());
                return schedule;
            }
           
       }

        return null;
    }

    /*
    ArrayList<Schedule> allSchedules = new ArrayList<>(); 
     
      public void addScheduleToAllSchedules(Schedule schedule){
        this.allSchedules.add(schedule);
       }
      
     */
    public static void listAllSchedules() {
        int counter = 1;
        System.out.println("O número total de marcações é : " + count);

        for (Schedule schedule: schedules) {
            System.out.println(
                    "Marcação numero - " + (counter++) + "\n"
                    + " # Local de vacinação #" + "\n"
                    + schedule.getVaccinationLocation().getName() + " | " + schedule.getVaccinationLocation().getAddress() + " | " + schedule.getVaccinationLocation().getPhoneNumber() + "\n"
                    + " # Data #" + "\n"
                    + schedule.getDate() + "\n"
                    + " # Hora #" + "\n"
                    + schedule.getTime() + "\n"
                    + " # Enfermeiro #" + "\n"
                    + schedule.getNurse().getName() + " | " + schedule.getNurse().getCardNumber() + " | " + schedule.getNurse().getPhoneNumber() + "\n"
                    + " # Utente #" + "\n"
                    + schedule.getPatient().getName() + " | " + schedule.getPatient().getGender() + " | " + schedule.getPatient().getYearOfBirth() + " | " + schedule.getPatient().getPatientNumber() + " | " + schedule.getPatient().getPhoneNumber() + "\n"
                    + " # Vacina #" + "\n"
                    + schedule.getVacccine().getBrand() + " | " + schedule.getVacccine().getLot() + "\n"
            );
        }

    }
    
    
    public static void saveSchedulesToFile() throws IOException {
       
        FileWriter fw = new FileWriter("Marcacoes.txt");
        for (Schedule schedule: schedules) {
		fw.write(schedule.getTypeOfLocation() + " - " + schedule.toString()+"\n");
//                fw.write("\n");
	}
	fw.close();
    }
    

    // Itera o array de Schedules e procura por um Schedule para o paciente com o número introduzido
    public static void searchScheduleByPatientNumber(int patientNumber) {
        for (Schedule schedule: schedules) {
            if (schedule.getPatient().getPatientNumber() == patientNumber) {
                System.out.println(schedule);
            }
        }
        
    }
    
    public static void deleteScheduleByPatientName(int patientNumber){
            try {
             for (Schedule schedule: schedules) {
//                 
                     if (schedule.getPatient().getPatientNumber() == patientNumber) {
                            schedules.remove(schedule);
                    }
             }
        } catch (Exception e) {
        }
             
       
                 
   
        
    }
    
    public static void searchScheduleByPatientÀge(int age)  {
        
        List<Schedule> sharedList = new ArrayList<>();
        int currentYear = 2021;
        int ageYear = currentYear - age;
        
        for (Schedule schedule: schedules) {
           
            if (schedule.getPatient().getYearOfBirth() == ageYear) {
                    sharedList.add(schedule);
            }

           
        }
         for(Schedule s : sharedList){
                System.out.println(s.toString());
            }
    }
    
    /**
     * 
     * @param date 
     */
    // imprime o toString de todas as marcações com a data pretendida.
    public static void searchByDate(String date) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule: schedules) {
            if (schedule.getDate().equals(date) ) {
                list.add(schedule);
            }
            
        }
        for(Schedule s : list){
            System.out.println(s.toString());
        }

    }
    /**
 * Método que permite listar indivíduos
 */    
    public static void listPeopleByDateAndLocation(String date, String location){
        List<Schedule> list = new ArrayList<>();
        
           for (Schedule schedule: schedules) {
                if(schedule.getDate().equals(date) 
                        && schedule.getVaccinationLocation().getName().equals(location)){
                    System.out.println("Enfermeiro - " + schedule.getNurse().getName() + " - " + schedule.getNurse().getPhoneNumber());
                    System.out.println("Utente - " + schedule.getPatient().getName() + " - " + schedule.getPatient().getPhoneNumber() );
                }
            }
        
  
    }
    public static void searchByBrand(String brand) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule: schedules) {
            if (schedule.getVacccine().getBrand().equals(brand)){
                list.add(schedule);
            }
        }
        for(Schedule s : list){
            System.out.println(s.toString());
        }

    }
    
    public static void searchByLot(String lot) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule: schedules) {
            if (schedule.getVacccine().getLot().equals(lot)){
                list.add(schedule);
            }
        }
        for(Schedule s : list){
           System.out.println(s.toString());
        }

    }
    
    public static void searchByBrandAndLot(String brand, String lot) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule: schedules) {
            if (schedule.getVacccine().getLot().equals(lot) && schedule.getVacccine().getBrand().equals(brand) ){
                list.add(schedule);
            }
        }
        for(Schedule s : list){
          System.out.println(s.toString());
        }

    }
    
    public static void findByVaccinationLocation(String name){
         List<Schedule> list = new ArrayList<>();
         System.out.println(name);
  
         
        for (Schedule schedule: schedules) {
            if(schedule.getVaccinationLocation().getName().equals(name)){
                list.add(schedule);
            }
        }
        for(Schedule s : list){
          System.out.println(s.toString());
        }
        
    }
    
   

}

	
