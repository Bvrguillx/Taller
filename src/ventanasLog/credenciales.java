package ventanasLog;

public class credenciales {

	public static boolean logeo(String usuario, String contrasenia){
		
		// VALORES HARDCODEADOS
		
		if ( usuario.equals("Burguillo")&&contrasenia.equals("1111") || 
			
			 usuario.equals("Triboga")&&contrasenia.equals("2222") ||
			
			 usuario.equals("Alex")&&contrasenia.equals("3333") || 
		
			 usuario.equals("Pablo")&&contrasenia.equals("4444") ) {
			
			return true;
			
		}	else	{
			
			return false;
			
		}
		
	}
		
	}
