const request = require('supertest');

const SPRING_BOOT_URL = 'http://spring:8080'

describe('API Endpoints', () => {
  it('should return 200 for GET /somma?num1=40&num2=2', async () => {
    expect(true).toBe(true);
    const response = await request(SPRING_BOOT_URL).get('/somma?num1=40&num2=2');
    expect(response.statusCode).toBe(200);
    expect(response.text).toContain('Risultato: 42');  
    });
});
