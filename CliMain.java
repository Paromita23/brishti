package com.hexaware.mlp178.util;

import java.util.Scanner;

import com.hexaware.mlp178.factory.AgentFactory;
import com.hexaware.mlp178.model.Agent;
import com.hexaware.mlp178.model.AgentCat;;



  class CliMain {
    private Scanner option = new Scanner(System.in, "UTF-8");
  
    private void mainAgent() {
      System.out.println("***Agent Details***");
      System.out.println("------------------------------");
      System.out.println("1. Show Agent");
      System.out.println("2. Insert details");
      System.out.println("3. Search Agent");
      System.out.println("4. Exit");
      mainAgentDetails();
    }
    private void mainAgentDetails() {
        try {
          System.out.println("Enter your choice:");
          int agentOption = option.nextInt();
          switch (agentOption) {
            case 1:
              showFullAgent();
              break;
            case 2:
              insertAgent();
              break;
            case 3:
              searchAgent();
              break;
            case 4:
              Runtime.getRuntime().halt(0);
            default:
              System.out.println("Choose from 1 to 3 : ");
          }
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Enter a valid value");
        }
        option.nextLine();
        mainAgent();
      }
      private void showFullAgent() {
        Agent[] agent = AgentFactory.showAgent();
        System.out.printf("%10s %10s %10s %10s %10s %10s","AgentId","Name","City",
        "Gender","MaritalStatus","Premium");
        System.out.println();
        for (Agent m : agent) {
             System.out.println(m);
             System.out.println();
           }
      }
      private void insertAgent() {
        Agent agent = new Agent();
        // System.out.println("Enter agent ID : ");
        // agent.setAgentId(option.nextInt());
        System.out.println("Enter Name : ");
        agent.setName(option.next());
        System.out.println("Enter City : ");
        agent.setCity(option.next());
        System.out.println("Enter Gender : ");
        String ws = option.next();
        AgentCat acat = AgentCat.MALE;
        if (ws.equals("MALE")||ws.equals("male")) {
          acat = AgentCat.MALE;
        }
        if (ws.equals("FEMALE")||ws.equals("female")) {
          acat = AgentCat.FEMALE;
        }
        agent.setGender(acat);
        System.out.println("Enter MaritalStatus : ");
        agent.setMaritalStatus(option.nextInt());
        System.out.println("Enter Premium : ");
        agent.setPremium(option.nextDouble());
        System.out.println(AgentFactory.insertAgent(agent));
      }
      private void searchAgent() {
        System.out.println("Enter Agentid");
        int agentid = option.nextInt();
        Agent agent1 = AgentFactory.searchAgent(agentid);
        if (agent1 != null) {
          System.out.println(agent1);
        }
        else
        {
          System.out.println("Not found...");
        }
      }

      public static void main(final String[] args) {
        final CliMain mainObj = new CliMain();
        mainObj.mainAgent();
      }
    }