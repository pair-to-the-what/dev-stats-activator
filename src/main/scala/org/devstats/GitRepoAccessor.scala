package org.devstats.accessor

import scala.collection.JavaConversions.asScalaBuffer

import org.gitlab.api.GitlabAPI
import org.gitlab.api.models.GitlabProject

class GitRepoAccessor(api: GitlabAPI) {
  
  def GetProjects(): List[GitlabProject] = {
   api.getAllProjects().toList
  }
}
