# Autor: Luis Alberto Petro

@stories
Feature: As a user, I want to be able to create a business unit and schedule a new meeting

  Background:
    Given than user enters the website
    And  enter valid access data
      |userName| password |
      |admin   | serenity |

  @scenario1
  Scenario Outline: Create a business unit
    Given than user navigate to the business unit screen

    When he creates the business unit on the StarSharp platform
      | nameBusinessUnit |  parentUnit  |
      |<nameBusinessUnit>| <parentUnit> |

    Then he finds the business unit created
      | nameBusinessUnit |
      |<nameBusinessUnit>|

    Examples:
      |nameBusinessUnit| parentUnit |
      |  luisUnit      | Admin       |

  @scenario2

  Scenario Outline: Schedule a new meeting
    Given than user navigate to the meeting screen

    When he creates Andresmeeting
      | nameLocation   | nameMeeting   | meetingType   | meetingNumber   | dateStart   | timeStarDate   | dateEnd   | timeEndDate   | location   | unit   | random   | name   | name2   | lastName   | email   | nameComplete   | nameComplete2   |
      | <nameLocation> | <nameMeeting> | <meetingType> | <meetingNumber> | <dateStart> | <timeStarDate> | <dateEnd> | <timeEndDate> | <location> | <unit> | <random> | <name> | <name2> | <lastName> | <email> | <nameComplete> | <nameComplete2> |


    Then he finds the new meeting called Luismeeting
      | nameMeeting   |
      | <nameMeeting> |

    Examples:
      | nameLocation | nameMeeting | meetingType | meetingNumber | dateStart  | timeStarDate | dateEnd    | timeEndDate | location | unit     | random | name | name2 | lastName | email            | nameComplete | nameComplete2 |
      | CEOH         | luisMeeting | General     | 15            | 05/25/2022 | 12:00        | 05/28/2022 | 13:00       | HQ     | luisunit | jbhjbj | Luis | Luis  | Petro    | lpetro@gmail.com | luis petro   | luis petro    |