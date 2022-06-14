// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XMapRequestEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("parent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window")
    );
    public static MemoryLayout $LAYOUT() {
        return XMapRequestEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XMapRequestEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XMapRequestEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XMapRequestEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XMapRequestEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XMapRequestEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XMapRequestEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XMapRequestEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XMapRequestEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XMapRequestEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XMapRequestEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XMapRequestEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XMapRequestEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XMapRequestEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XMapRequestEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XMapRequestEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XMapRequestEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XMapRequestEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XMapRequestEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XMapRequestEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XMapRequestEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parent"));
    public static VarHandle parent$VH() {
        return XMapRequestEvent.parent$VH;
    }
    public static long parent$get(MemorySegment seg) {
        return (long)XMapRequestEvent.parent$VH.get(seg);
    }
    public static void parent$set( MemorySegment seg, long x) {
        XMapRequestEvent.parent$VH.set(seg, x);
    }
    public static long parent$get(MemorySegment seg, long index) {
        return (long)XMapRequestEvent.parent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parent$set(MemorySegment seg, long index, long x) {
        XMapRequestEvent.parent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XMapRequestEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XMapRequestEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XMapRequestEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XMapRequestEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XMapRequestEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
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


