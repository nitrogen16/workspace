package chainOfResponsibility;
import chainOfResponsibility.space.SpaceShip;
import chainOfResponsibility.space.crew.AbstractCrewMember;
import chainOfResponsibility.space.crew.AbstractCrewMember.CompetencyLevel;

/* 
Chain of Responsibility
*/
public class Solution {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        AbstractCrewMember crewMember = spaceShip.getCrewChain();
        
        System.out.println(CompetencyLevel.NOVICE.ordinal());
        System.out.println(CompetencyLevel.INTERMEDIATE.ordinal());
        System.out.println(CompetencyLevel.ADVANCED.ordinal());
        System.out.println(CompetencyLevel.EXPERT.ordinal());
        
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.EXPERT, "ATTACK");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.NOVICE, "WASH THE FLOOR");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.INTERMEDIATE, "CHECK ENGINE");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.ADVANCED, "SET ROUTE");
    }
}
