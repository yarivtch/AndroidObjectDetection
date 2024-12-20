# אפליקציית זיהוי אובייקטים | Object Detection App

[English](#english) | [עברית](#hebrew)

<h2 id="hebrew">עברית</h2>

## תיאור הפרויקט
אפליקציית אנדרואיד המאפשרת זיהוי אובייקטים בזמן אמת באמצעות מצלמת המכשיר. האפליקציה משלבת טכנולוגיות מתקדמות של ראייה ממוחשבת ולמידת מכונה לזיהוי מדויק של אובייקטים.

### תכונות עיקריות
- **זיהוי בזמן אמת**: זיהוי אובייקטים מותאם אישית באמצעות המצלמה
- **שליטה בתאורה**: אפשרות להפעלת הפלאש לתנאי תאורה שונים
- **טיימר מובנה**: הגדרת זמן מקסימלי לזיהוי
- **משוב למשתמש**: התראות קוליות וויזואליות בעת זיהוי
- **ממשק ידידותי**: ממשק משתמש אינטואיטיבי ונוח לשימוש

### דרישות מערכת
- Android 6.0 (API level 23) ומעלה
- מצלמה אחורית
- פלאש (אופציונלי)
- מינימום 2GB RAM
- חיישני תנועה בסיסיים

### התקנת Android Studio והגדרת הפרויקט

#### שלב 1: התקנת Android Studio
1. הורדת Android Studio:
   - בקר באתר הרשמי: https://developer.android.com/studio
   - לחץ על "Download Android Studio"
   - בחר בגרסה המתאימה למערכת ההפעלה שלך (Windows/Mac/Linux)

2. התקנת Android Studio:
   - הפעל את קובץ ההתקנה שהורדת
   - עקוב אחר אשף ההתקנה
   - בחר ב"Custom" installation כדי להתקין:
     - Android SDK
     - Android Virtual Device
     - Performance (Intel HAXM)
   - המתן להשלמת ההתקנה

3. הגדרה ראשונית:
   - הפעל את Android Studio בפעם הראשונה
   - המתן להורדת רכיבים נוספים
   - קבל את תנאי הרישיון
   - בחר ערכת נושא (Theme) מועדפת

#### שלב 2: הגדרת אמולטור (אופציונלי)
1. פתח את Android Studio
2. לחץ על Tools > Device Manager
3. לחץ על Create Virtual Device
4. בחר מכשיר (למשל Pixel 4)
5. הורד והתקן System Image (מומלץ API 30)
6. הגדר שם לאמולטור ולחץ Finish

#### שלב 3: הורדת והגדרת הפרויקט
1. הורדת הפרויקט: 
bash
git clone https://github.com/username/ObjectDetectionApp.git

. פתיחת הפרויקט:
   - פתח את Android Studio
   - לחץ על File > Open
   - נווט לתיקיית הפרויקט שהורדת
   - לחץ OK

3. סנכרון הפרויקט:
   - המתן לסנכרון Gradle אוטומטי
   - אם נדרש, לחץ על Sync Project with Gradle Files

### הרצת האפליקציה
1. **על מכשיר פיזי**:
   - חבר את המכשיר למחשב באמצעות USB
   - הפעל Debug Mode במכשיר:
     - פתח הגדרות > אודות הטלפון
     - הקש 7 פעמים על Build Number
     - חזור להגדרות > אפשרויות למפתחים
     - הפעל USB Debugging
   - בחר את המכשיר ב-Android Studio
   - לחץ על Run (כפתור ירוק)

2. **על אמולטור**:
   - בחר את האמולטור שהגדרת
   - לחץ על Run

### הרשאות נדרשות
- גישה למצלמה
- גישה לפלאש
- אחסון (לשמירת תמונות - אופציונלי)

### שימוש באפליקציה
1. **הפעלה ראשונית**:
   - אשר את כל ההרשאות הנדרשות
   - כוון את המצלמה לאזור הרצוי

2. **הגדרת זיהוי**:
   - הכנס שם של אובייקט לזיהוי
   - הגדר זמן מקסימלי לזיהוי
   - לחץ על כפתון "התחל זיהוי"

3. **קבלת תוצאות**:
   - המערכת תציג מסגרת סביב האובייקט שזוהה
   - תתקבל התראה קולית בזיהוי מוצלח
   - אפשרות לשמירת תוצאות הזיהוי

### פתרון בעיות נפוצות
1. **בעיות בהתקנת Android Studio**:
   - וודא מספיק מקום פנוי בדיסק (מינימום 8GB)
   - התקן את כל עדכוני המערכת
   - וודא שיש לך הרשאות מנהל

2. **בעיות בהרצת האפליקציה**:
   - המצלמה לא נפתחת: בדוק הרשאות מצלמה
   - בעיות בזיהוי: וודא תאורה מספקת
   - האפליקציה איטית: בדוק שימוש בזיכרון ומשאבי מערכת

3. **בעיות באמולטור**:
   - וודא שה-BIOS מאפשר וירטואליזציה
   - התקן Intel HAXM אם טרם הותקן
   - הגדל את הזיכרון המוקצה לאמולטור

## טכנולוגיות
- Kotlin
- Android Camera2 API
- ML Kit
- CameraX
- Android Jetpack

## רישיון
MIT License

## קרדיטים
פותח על ידי [שם המפתח]

## יצירת קשר
- Email: [כתובת אימייל]
- GitHub: [@username](https://github.com/username)

---
