import java.util.List;

import controller.ArtifactHelper;
import controller.PresidentHelper;
import model.Artifact;
import model.President;
public class ArtifactTester {
	
	public static void main(String[] args) {
		President George = new President(32, "George W. Bush");
		PresidentHelper presHelp = new PresidentHelper();
		presHelp.insertPresident(George);
		
		ArtifactHelper artHelp = new ArtifactHelper();
		Artifact brush = new Artifact(320, "Hair Brush", George);
		artHelp.insertArtifact(brush);
		
		List<Artifact> allPresidents = artHelp.showAllArtifacts();
		
		System.out.println("Printing all artifacts");
		for(Artifact a : allPresidents) {
			System.out.println(a.toString());
		}
	}
}
