const { test, expect } = require('@playwright/test');

test.describe('Hapana Login Tests', () => {
  test('should login successfully', async ({ page }) => {
    // Navigate to the login page
    await page.goto('https://qacore.hapana.com/index.php?route=dashboard/clients/assessment&cid=NzI5NjQ2#clientinfo');

    // Fill in login form
    await page.fill('input[name="email"]', 'trainingtime@hapana.com');
    await page.fill('input[name="password"]', 'India@12');

    // Click login button
    await page.click('button[type="submit"]');

    // Wait for navigation and verify login success
    await page.waitForLoadState('networkidle');
    
    // Verify we're on the correct page
    await page.waitForSelector('.user-profile, .dashboard, .welcome, a[href*="dashboard"], a[href*="clients"]');
  });

  test('should navigate to schedule page', async ({ page }) => {
    // First perform login
    await page.goto('https://qacore.hapana.com/index.php?route=dashboard/clients/assessment&cid=NzI5NjQ2#clientinfo');
    await page.fill('input[name="email"]', 'trainingtime@hapana.com');
    await page.fill('input[name="password"]', 'India@12');
    await page.click('button[type="submit"]');
    await page.waitForLoadState('networkidle');

    // Click on Schedule link
    await page.click('a:has-text("Schedule"), a[href*="schedule"], .schedule-link');

    // Wait for schedule page to load
    await page.waitForLoadState('networkidle');
    await page.waitForSelector('[class*="schedule"], [id*="schedule"]');
  });
}); 