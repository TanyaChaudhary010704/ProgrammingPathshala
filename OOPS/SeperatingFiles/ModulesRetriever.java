package SeperatingFiles;

import java.util.ArrayList;
import java.util.List;

public class ModulesRetriever {
  public final List<String> freeModules = new ArrayList<>();

  public ModulesRetriever() {
    freeModules.add("Gearing Up");
    freeModules.add("Advanced DSA");
    freeModules.add("Advanced DSA II");
    freeModules.add("Low Level Design");
  }

  public List<String> getModules() {
    return freeModules;
  }
  
}
