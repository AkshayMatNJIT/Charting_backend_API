# Charting_backend_API
This is the git repository for the backend API of Charting team.

To run -

1. Clone the repo.
2. Open in IntelliJ IDE.
3. Build and Run ChartingApplication main class.
4. Test in Postman with valid URL, paramters and Request body.

Sample URLs -

Lab Reports:

GET by id: http://localhost:8080/labreport?reportid=2

GET all lab reports: http://localhost:8080/getalllabreports

POST: http://localhost:8080/addlabreport

Sample Request body: {
    "patientId": 1111,
    "doctorId": 2222,
    "reportId": 3,
    "reportName": "Lab Report 1",
    "worksheetFilepath": "https: //s3.us-west-2.amazonaws.com/mybucket/worksheet.pdf",
    "patientFilepath": "https: //s3.us-west-2.amazonaws.com/mybucket/patientFile.pdf",
    "description": "This is a lab report.",
    "dueBy": "Dec 12, 2021, 3:22:26 AM"
}

Medication:

GET by id: http://localhost:8080/medication?medicationid=2

GET all Medication records: http://localhost:8080/getallmedicationreports

POST: http://localhost:8080/addmedicationrecord

Sample Request body:
{
    "patientId": 1111,
    "doctorId": 2222,
    "medicationName": "Medication 1",
    "medicationRoutine": "3 times daily",
    "description": "to be followed regularly",
    "tillDate": "Dec 5, 2021, 3:22:26 AM"
}
