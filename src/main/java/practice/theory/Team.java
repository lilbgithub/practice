package practice.theory;

import java.util.*;

public class Team {
    String city;
    String department;

    public Team(String city, String department) {
        this.city = city;
        this.department = department;
    }

    public static void main(String[] args) {
        Map<Team,String> leaders = new HashMap<>();
        leaders.put(new Team("New York", "development"), "Anne");
        leaders.put(new Team("Boston", "development"), "Brian");
        leaders.put(new Team("Boston", "marketing"), "Charlie");

        Team myTeam = new Team("New York", "development");
        String myTeamLeader = leaders.get(myTeam);
        System.out.println(myTeamLeader);

        Set<Team> set = new HashSet<>();
        set.add(new Team("New York", "development"));
        Team team= (new Team("Boston", "development"));

        set.add(team);
       // this retreives value
        System.out.println(set.contains(team));
        //but this will not

        System.out.println(set.contains(new Team("Boston", "development")));

        List<String>	numbers	=	new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        Collections.sort(numbers);
        System.out.println(numbers);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(city, team.city) &&
                Objects.equals(department, team.department);
    }
/*  if we comment hash code it wont return value

    @Override
    public int hashCode() {
        return Objects.hash(city, department);
    }*/
}
