// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XKeyboardControl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("key_click_percent"),
        Constants$root.C_INT$LAYOUT.withName("bell_percent"),
        Constants$root.C_INT$LAYOUT.withName("bell_pitch"),
        Constants$root.C_INT$LAYOUT.withName("bell_duration"),
        Constants$root.C_INT$LAYOUT.withName("led"),
        Constants$root.C_INT$LAYOUT.withName("led_mode"),
        Constants$root.C_INT$LAYOUT.withName("key"),
        Constants$root.C_INT$LAYOUT.withName("auto_repeat_mode")
    );
    public static MemoryLayout $LAYOUT() {
        return XKeyboardControl.$struct$LAYOUT;
    }
    static final VarHandle key_click_percent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key_click_percent"));
    public static VarHandle key_click_percent$VH() {
        return XKeyboardControl.key_click_percent$VH;
    }
    public static int key_click_percent$get(MemorySegment seg) {
        return (int)XKeyboardControl.key_click_percent$VH.get(seg);
    }
    public static void key_click_percent$set( MemorySegment seg, int x) {
        XKeyboardControl.key_click_percent$VH.set(seg, x);
    }
    public static int key_click_percent$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.key_click_percent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key_click_percent$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.key_click_percent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_percent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_percent"));
    public static VarHandle bell_percent$VH() {
        return XKeyboardControl.bell_percent$VH;
    }
    public static int bell_percent$get(MemorySegment seg) {
        return (int)XKeyboardControl.bell_percent$VH.get(seg);
    }
    public static void bell_percent$set( MemorySegment seg, int x) {
        XKeyboardControl.bell_percent$VH.set(seg, x);
    }
    public static int bell_percent$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.bell_percent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_percent$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.bell_percent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_pitch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_pitch"));
    public static VarHandle bell_pitch$VH() {
        return XKeyboardControl.bell_pitch$VH;
    }
    public static int bell_pitch$get(MemorySegment seg) {
        return (int)XKeyboardControl.bell_pitch$VH.get(seg);
    }
    public static void bell_pitch$set( MemorySegment seg, int x) {
        XKeyboardControl.bell_pitch$VH.set(seg, x);
    }
    public static int bell_pitch$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.bell_pitch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_pitch$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.bell_pitch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_duration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_duration"));
    public static VarHandle bell_duration$VH() {
        return XKeyboardControl.bell_duration$VH;
    }
    public static int bell_duration$get(MemorySegment seg) {
        return (int)XKeyboardControl.bell_duration$VH.get(seg);
    }
    public static void bell_duration$set( MemorySegment seg, int x) {
        XKeyboardControl.bell_duration$VH.set(seg, x);
    }
    public static int bell_duration$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.bell_duration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_duration$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.bell_duration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle led$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("led"));
    public static VarHandle led$VH() {
        return XKeyboardControl.led$VH;
    }
    public static int led$get(MemorySegment seg) {
        return (int)XKeyboardControl.led$VH.get(seg);
    }
    public static void led$set( MemorySegment seg, int x) {
        XKeyboardControl.led$VH.set(seg, x);
    }
    public static int led$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.led$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void led$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.led$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle led_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("led_mode"));
    public static VarHandle led_mode$VH() {
        return XKeyboardControl.led_mode$VH;
    }
    public static int led_mode$get(MemorySegment seg) {
        return (int)XKeyboardControl.led_mode$VH.get(seg);
    }
    public static void led_mode$set( MemorySegment seg, int x) {
        XKeyboardControl.led_mode$VH.set(seg, x);
    }
    public static int led_mode$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.led_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void led_mode$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.led_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return XKeyboardControl.key$VH;
    }
    public static int key$get(MemorySegment seg) {
        return (int)XKeyboardControl.key$VH.get(seg);
    }
    public static void key$set( MemorySegment seg, int x) {
        XKeyboardControl.key$VH.set(seg, x);
    }
    public static int key$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle auto_repeat_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("auto_repeat_mode"));
    public static VarHandle auto_repeat_mode$VH() {
        return XKeyboardControl.auto_repeat_mode$VH;
    }
    public static int auto_repeat_mode$get(MemorySegment seg) {
        return (int)XKeyboardControl.auto_repeat_mode$VH.get(seg);
    }
    public static void auto_repeat_mode$set( MemorySegment seg, int x) {
        XKeyboardControl.auto_repeat_mode$VH.set(seg, x);
    }
    public static int auto_repeat_mode$get(MemorySegment seg, long index) {
        return (int)XKeyboardControl.auto_repeat_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void auto_repeat_mode$set(MemorySegment seg, long index, int x) {
        XKeyboardControl.auto_repeat_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


