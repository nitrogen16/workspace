package chainOfResponsibility.space;
import chainOfResponsibility.space.crew.AbstractCrewMember;
import chainOfResponsibility.space.crew.CabinBoy;
import chainOfResponsibility.space.crew.Captain;
import chainOfResponsibility.space.crew.Engineer;
import chainOfResponsibility.space.crew.FirstMate;

public class SpaceShip {
    public AbstractCrewMember getCrewChain(){
        AbstractCrewMember cabinBoy = new CabinBoy(AbstractCrewMember.CompetencyLevel.NOVICE);
        AbstractCrewMember engineer = new Engineer(AbstractCrewMember.CompetencyLevel.INTERMEDIATE);
        AbstractCrewMember firstMate = new FirstMate(AbstractCrewMember.CompetencyLevel.ADVANCED);
        AbstractCrewMember captain = new Captain(AbstractCrewMember.CompetencyLevel.EXPERT);

        cabinBoy.setNextCrewMember(engineer);
        engineer.setNextCrewMember(firstMate);
        firstMate.setNextCrewMember(captain);

        return cabinBoy;
    }
}
