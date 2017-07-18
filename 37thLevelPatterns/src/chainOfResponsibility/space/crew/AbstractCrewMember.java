package chainOfResponsibility.space.crew;

public abstract class AbstractCrewMember {
    public enum CompetencyLevel {
        NOVICE,
        INTERMEDIATE,
        ADVANCED,
        EXPERT
    }

    protected CompetencyLevel competencyLevel;
    protected AbstractCrewMember nextCrewMember;

    public void setNextCrewMember(AbstractCrewMember nextCrewMember) {
        this.nextCrewMember = nextCrewMember;
    }

    public void handleRequest(CompetencyLevel competencyLevel, String request) {
        if (this.competencyLevel.compareTo(competencyLevel) == 0) {
            doTheJob(request);
            return;
        }
        
        if (this.competencyLevel.compareTo(competencyLevel) != 0) {
            nextCrewMember.handleRequest(competencyLevel, request);
            System.out.println(nextCrewMember);
        }
    }

    protected abstract void doTheJob(String request);
}
