package javaTest;

public class TimeDuration {
	
	public int nbSeconds = 0;
	
	public TimeDuration(int nbSeconds)
	{
		this.nbSeconds = nbSeconds;
	}
	
	public String toString()
	{
		int nbHeure = nbSeconds / 3600;
		int nbsecondesRestantes = nbSeconds % 3600;
		int nbMinutes = nbsecondesRestantes / 60;
		nbsecondesRestantes = nbsecondesRestantes % 60;
		
		if(nbSeconds > 3600)
		{
			String heureMinutesSecondes = Integer.toString(nbHeure) + "h " + Integer.toString(nbMinutes) + "m " + Integer.toString(nbsecondesRestantes);
			return heureMinutesSecondes;
		}
		
		if(nbSeconds > 60)
		{
			String minutesSecondes = Integer.toString(nbMinutes) + "m " + Integer.toString(nbsecondesRestantes);
			return minutesSecondes;
		}
		else
		{
			String secondes = Integer.toString(nbsecondesRestantes);
			return secondes;
		}	
	}
}
