package org.devstats.accessors

import java.util.ArrayList
import org.specs2._
import org.scalamock.scalatest.MockFactory
import org.gitlab.api.GitlabAPI
import org.gitlab.api.models.GitlabProject
import org.devstats.accessor

class GitRepoAccessorSpec extends Specification with MockFactory {
  "Testing GitlabAPI".txt

  "When we mock out the API" >> {
    val apiMock = mock[GitlabAPI]

    "and `getAllProjects` returns an empty array" >> {
      (apiMock.getAllProjects _).when().returning(new ArrayList[GitlabProject])

      new GitRepoAccessor(apiMock).GetProjects() must beEmpty
    }
  }
}

/*
class HelloWorldSpec extends Specification {
  "This is a specification for the 'Hello world' string".txt

  "The 'Hello world' string should" >> {
    "contain 11 characters" >> {
      "Hello world" must haveSize(11)
    }
    "start with 'Hello'" >> {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" >> {
      "Hello world" must endWith("world")
    }
  }
}
*/
